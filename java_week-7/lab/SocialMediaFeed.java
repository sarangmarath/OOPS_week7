class SocialMediaPost {
    protected String author;
    protected String content;
    protected String time;

    public SocialMediaPost(String author, String content, String time) {
        this.author = author;
        this.content = content;
        this.time = time;
    }

    public void display() {
        System.out.println("Post by " + author + " at " + time + ": " + content);
    }
}

class InstagramPost extends SocialMediaPost {
    private int likes;

    public InstagramPost(String author, String content, String time, int likes) {
        super(author, content, time);
        this.likes = likes;
    }

    @Override
    public void display() {
        System.out.println("Instagram: " + content + " #" + author + " - Likes: " + likes);
    }
}

class TwitterPost extends SocialMediaPost {
    private int retweets;

    public TwitterPost(String author, String content, String time, int retweets) {
        super(author, content, time);
        this.retweets = retweets;
    }

    @Override
    public void display() {
        System.out.println("Twitter: " + content + " by @" + author + " - Retweets: " + retweets + " (" + content.length() + " chars)");
    }
}

class LinkedInPost extends SocialMediaPost {
    private int connections;

    public LinkedInPost(String author, String content, String time, int connections) {
        super(author, content, time);
        this.connections = connections;
    }

    @Override
    public void display() {
        System.out.println("LinkedIn: " + content + " by " + author + " - Connections: " + connections);
    }
}

public class SocialMediaFeed {
    public static void main(String[] args) {
        SocialMediaPost[] posts = {
            new InstagramPost("alice", "Enjoying sunset!", "10:00 AM", 120),
            new TwitterPost("bob", "Learning Java!", "11:00 AM", 50),
            new LinkedInPost("carol", "Published new article!", "12:00 PM", 200)
        };

        for (SocialMediaPost post : posts) {
            post.display();  // Runtime polymorphism
        }
    }
}
