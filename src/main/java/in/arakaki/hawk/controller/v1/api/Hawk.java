package in.arakaki.hawk.controller.v1.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.arakaki.hawk.dto.response.Response;
import in.arakaki.hawk.service.TweetsService;
import in.arakaki.hawk.service.UserService;
import io.swagger.annotations.Api;

/**
 * Created by Everton Arakaki.
 */
@RestController
@RequestMapping("/api/v1/")
@Api(value = "Hawk-application", description = "")
public class Hawk {
    @Autowired
    private TweetsService TweetsService;

    @Autowired
    private UserService userService;

    @GetMapping("/tweets")
    public Response<?> getAllTweets() {
        return Response
                .ok()
                .setPayload(TweetsService.getAllTweets());
    }
    
    @GetMapping("/tweets/hashtag/{hashtagname}")
    public Response<?> getAllTweetsByHashtag(@PathVariable(value="hashtagname") String hashtag )  {
        return Response
                .ok()
                .setPayload(TweetsService.getAllTweetsByHashtag(hashtag));
    }

}
