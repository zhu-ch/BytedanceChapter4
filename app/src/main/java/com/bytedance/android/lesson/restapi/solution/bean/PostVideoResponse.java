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
        @SerializedName("image_url") private String image_url;
        @SerializedName("video_url") private String video_url;

        public String getStudent_id() {
            return student_id;
        }

        public void setStudent_id(String student_id) {
            this.student_id = student_id;
        }

        public String getUser_name() {
            return user_name;
        }

        public void setUser_name(String user_name) {
            this.user_name = user_name;
        }

        public String getImage_url() {
            return image_url;
        }

        public void setImage_url(String image_url) {
            this.image_url = image_url;
        }

        public String getVideo_url() {
            return video_url;
        }

        public void setVideo_url(String video_url) {
            this.video_url = video_url;
        }

        @Override public String toString(){
            return "Myitem{"+
                    "student_id='"+student_id+"', "+
                    "user_name='"+user_name+"', "+
                    "image_url='"+image_url+"', "+
                    "video_url='"+video_url+"'}";
        }
    }

    @Override public String toString(){
        return "PostVideoResponse{"+
                "success='"+success+"', "+
                "item='"+item+"'}";
    }
}