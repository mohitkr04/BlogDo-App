package com.example.blogdoapp

object BlogRepository {
    val blogList: MutableList<BlogData> = mutableListOf(
        BlogData(
            userName = "JohnDoe",
            date = "21-05-2024",
            time = "14:30",
            title = "My First Blog Post",
            blog = "This is the content of my first blog post.",
            isLiked = true,
            isSaved = false
        ),
        BlogData(
            userName = "JaneSmith",
            date = "22-05-2024",
            time = "10:00",
            title = "A Day in the Life",
            blog = "Today, I went to the park and enjoyed a sunny day.",
            isLiked = false,
            isSaved = true
        ),
        BlogData(
            userName = "AliceJohnson",
            date = "2024-05-23",
            time = "09:15",
            title = "Tech Trends in 2024",
            blog = "Exploring the latest technology trends and predictions for 2024.",
            isLiked = true,
            isSaved = true
        ),
        BlogData(
            userName = "BobBrown",
            date = "24-05-2024",
            time = "16:45",
            title = "Healthy Eating Tips",
            blog = "Sharing some useful tips for maintaining a healthy diet.",
            isLiked = false,
            isSaved = false
        ),
        BlogData(
            userName = "CharlieDavis",
            date = "25-05-2024",
            time = "12:00",
            title = "Travel Guide to Japan",
            blog = "An extensive travel guide to exploring the beautiful country of Japan.",
            isLiked = true,
            isSaved = true
        )
    )
}
