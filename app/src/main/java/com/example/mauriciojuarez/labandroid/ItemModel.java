package com.example.mauriciojuarez.labandroid;


import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mauriciojuarez on 2/21/18.
 */

public class ItemModel implements Parcelable {

    private final String header;
    private final String body;
    private final List<String> values;

    public ItemModel(String header, String body, List<String> values) {
        this.header = header;
        this.body = body;
        this.values = values;
    }

    public ItemModel(Parcel parcel) {
        header = parcel.readString();
        body = parcel.readString();
        values = new ArrayList<>();
        parcel.readStringList(values);
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(header);
        parcel.writeString(body);
        parcel.writeStringList(values);
    }

    public static final Parcelable.Creator<ItemModel> CREATOR = new Creator<ItemModel>() {
        @Override
        public ItemModel createFromParcel(Parcel parcel) {
            return new ItemModel(parcel);
        }

        @Override
        public ItemModel[] newArray(int i) {
            return new ItemModel[i];
        }
    };


}
