package com.bytedance.android.lesson.restapi.solution.bean;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import javax.sql.StatementEvent;

import retrofit2.http.Url;


/**
 * @author Xavier.S
 * @date 2019.01.17 18:08
 */

public class Cat {

    // TODO-C1 (1) Implement your Cat Bean here according to the response json

    @SerializedName("breeds") private List<String> breeds;
    @SerializedName("categories") private List<MyCategory> categories;
    @SerializedName("id") private String id;
    @SerializedName("url") private String url;

    public static class MyCategory{
        @SerializedName("id") private int id;
        @SerializedName("name") private String name;

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        @Override public String toString(){
            return "MyCategory{"+
                    "id="+id+
                    ", name='"+name+"'}";
        }
    }

    public List<String> getBreeds() {
        return breeds;
    }

    public List<MyCategory> getCategories() {
        return categories;
    }

    public String getId() {
        return id;
    }

    public String getUrl() {
        return url;
    }

    @Override public String toString(){
        return "Cats{"+
                "breeds='"+breeds+"'"+
                ", categories='"+categories+"'"+
                ", id='"+id+"'"+
                ", url='"+url+"'}";
    }
}
