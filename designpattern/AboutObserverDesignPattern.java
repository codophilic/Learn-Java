import java.util.ArrayList;
import java.util.List;

// Observer Interface
interface Observer {
    void update(String message);
}

// Concrete Observer (Subscriber)
class User implements Observer {
    private String name;
    
    public User(String name) {
        this.name = name;
    }
    
    @Override
    public void update(String message) {
        System.out.println(name + " received notification: " + message);
    }
}

// Subject (Publisher)
interface Publisher{
    void subscribe(Observer observer);
    void unsubscribe(Observer observer);
    void notifySubscribers(String videoTitle);
}


class YouTubeChannel implements Publisher{
    private List<Observer> subscribers = new ArrayList<>();
    
    @Override
    public void subscribe(Observer observer) {
        subscribers.add(observer);
    }
    
    @Override
    public void unsubscribe(Observer observer) {
        subscribers.remove(observer);
    }
    
    public void uploadNewVideo(String videoTitle) {
        System.out.println("New Video Uploaded: " + videoTitle);
        notifySubscribers(videoTitle);
    }
    
    @Override
    public void notifySubscribers(String videoTitle) {
        for (Observer subscriber : subscribers) {
            subscriber.update("New video available: " + videoTitle);
        }
    }
}

// Main Class
public class AboutObserverDesignPattern {
    public static void main(String[] args) {
        YouTubeChannel channel = new YouTubeChannel();
        
        Observer user1 = new User("Alice");
        Observer user2 = new User("Bob");
        
        channel.subscribe(user1);
        channel.subscribe(user2);
        
        channel.uploadNewVideo("Observer Design Pattern Explained!");
        
        channel.unsubscribe(user1);
        
        channel.uploadNewVideo("Adapter Pattern in Java!");
    }
}
