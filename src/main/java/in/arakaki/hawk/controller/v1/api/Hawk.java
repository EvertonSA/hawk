package in.arakaki.hawk.controller.v1.api;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.arakaki.hawk.controller.v1.request.BookTicketRequest;
import in.arakaki.hawk.controller.v1.request.GetTripSchedulesRequest;
import in.arakaki.hawk.dto.model.user.UserDto;
import in.arakaki.hawk.dto.response.Response;
import in.arakaki.hawk.service.TweetsService;
import in.arakaki.hawk.service.UserService;
import in.arakaki.hawk.util.DateUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.Authorization;

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

    
    @GetMapping("/tweets/hashtag/")
    public Response<?> getAllTweetsByHashtag(@RequestParam(value="name") {
        return Response
                .ok()
                .setPayload(TweetsService.getAllTweetsByHashtag());
    }

}
