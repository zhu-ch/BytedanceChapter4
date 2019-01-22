package com.bytedance.android.lesson.restapi.solution.bean;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @author Xavier.S
 * @date 2019.01.20 14:17
 */
public class FeedResponse {

    // TODO-C2 (2) Implement your FeedResponse Bean here according to the response json

    @SerializedName("feeds") private List<Feed.MyFeeds> feeds;
    @SerializedName("success") private boolean success;

    public List<Feed.MyFeeds> getFeeds() {
        return feeds;
    }

    public boolean isSuccess() {
        return success;
    }

    public static class MyFeeds{
        @SerializedName("student_id") private String student_id;
        @SerializedName("user_name") private  String user_name;
        @SerializedName("image_url") private String image_url;
        @SerializedName("video_url") private String video_url;

        public String getStudent_id() {
            return student_id;
        }

        public String getUser_name() {
            return user_name;
        }

        public String getImage_url() {
            return image_url;
        }

        public String getVideo_url() {
            return video_url;
        }

        @Override public String toString(){
            return "MyFeeds{"+
                    "student_id='"+student_id+"', "+
                    "user_name='"+user_name+"', "+
                    "image_url='"+image_url+"', "+
                    "video_url='"+video_url+
                    "'}";
        }
    }

    @Override public String toString(){
        return "Feeds{"+
                "feeds='"+feeds+"'"+
                ", success='"+success+
                "'}";
    }
}
