package com.bytedance.android.lesson.restapi.solution.bean;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @author Xavier.S
 * @date 2019.01.18 17:53
 */
public class PostVideoResponse {

    // TODO-C2 (3) Implement your PostVideoResponse Bean here according to the response json

    @SerializedName("success") private boolean success;
    @SerializedName("item") private List<Myitem> item;

    private class Myitem{
        @SerializedName("student_id") private String student_id;
        @SerializedName("user_name") private String user_name;
        @SerializedName("cover_image") private String cover_image;
        @SerializedName("video") private String video;


        public String getStudent_id() {
            return student_id;
        }

        public String getUser_name() {
            return user_name;
        }

        public String getCover_image() {
            return cover_image;
        }

        public String getVideo() {
            return video;
        }
    }
}