package com.example.demo.SystemDesignPractice;

import java.util.ArrayList;
import java.util.List;

//Design a Social Media Platform that allows users to create accounts,
// make posts, and view posts. The platform should have the following features:
//User Registration → Allow new users to join the platform by registering with a name.
//Create Posts → Registered users can create and add posts to their profiles.
//View Posts → View all posts made by a specific user. If the user does not exist, display an appropriate message.
public class SocialManagement {
    static List<User> userList = new ArrayList<>();

    static class User {
        private String userName;
        private List<String> post;

        public User(String userName, List<String> post) {
            this.userName = userName;
            this.post = post;
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public List<String> getPost() {
            return post;
        }

        public void setPost(List<String> post) {
            this.post = post;
        }
    }

    static class SocialMedia {
        public  void UserRegistration(String user) {
            User user1 = new User(user, new ArrayList<>());
            userList.add(user1);
        }

        public  void createPost(String name, String postContent) {
            for (User userName : userList) {
                if (userName.getUserName().equals(name)) {
                    List<String> postList = userName.getPost();
                    postList.add(postContent);
                    userName.setPost(postList);
                }
            }
        }

        public  void viewPost(String userName) {
            boolean userFound = false;
            for (User user : userList) {
                if (user.getUserName().equals(userName)) {
                    userFound = true;
                    System.out.println(user.getPost());
                }

            }
            if (!userFound) {
                System.out.println("not found");
            }
        }
    }

    public static void main(String[] args) {
        SocialMedia socialMedia = new SocialMedia();
        socialMedia.UserRegistration("Ayushi09");
        socialMedia.UserRegistration("starrio_09");
        socialMedia.createPost("Ayushi09","Jalsa");
        socialMedia.createPost("Ayushi09","Jalsa2029");
        socialMedia.createPost("starrio_09","Lowes annual party");
        socialMedia.viewPost("Ayushi09");
        socialMedia.viewPost("starrio_09");
        socialMedia.viewPost("Ayushi0");


    }
}
