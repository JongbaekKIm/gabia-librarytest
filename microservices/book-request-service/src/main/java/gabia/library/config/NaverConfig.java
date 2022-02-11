package gabia.library.config;

import lombok.Getter;
import org.springframework.context.annotation.Configuration;

@Getter
@Configuration
public class NaverConfig {

    private final String clientId = "5Jl3LLFq6CRMPpwIsTRL";
    private final String secretId = "GVgezEv8Yw";
    private final String url = "https://openapi.naver.com/v1/search/book_adv?&display=12&d_title=";
    private final String pageurl = "&start=";

    public String geturl(String title, Long page){
        return url + title + pageurl + page;
    }
}
