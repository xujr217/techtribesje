package je.techtribes.component.twitterconnector;

import com.structurizr.annotation.Component;
import je.techtribes.domain.Tweet;

import java.util.List;

@Component(description = "Pulls profile information and tweets from Twitter.")
public interface TwitterConnector {

    public List<TwitterProfile> getTwitterProfiles();

    public List<Tweet> getRecentTweets();

    public void startStreaming(StreamingTweetListener tweetListener);

    public void stopStreaming();

}
