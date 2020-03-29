package ma.crafts.bdd.cucumber.http;

import io.cucumber.core.internal.gherkin.deps.com.google.gson.JsonObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class RestClient {
    private static final String SERVER_URL = "http://localhost";

    @Autowired
    private RestTemplate restTemplate;

    @Value("${server.port}")
    private int port;

    private String endpoint() {
        return SERVER_URL + ":" + port;
    }

    public ResponseEntity<Object> getContent(String path) {
        HttpHeaders headers = getHttpHeaders();
       final  HttpEntity<HttpHeaders> entity = new HttpEntity<>(headers);
        return restTemplate.exchange(endpoint() + path, HttpMethod.GET, entity, Object.class);
    }

    public ResponseEntity<Object> getContent(String path,Integer requestBody) {
        HttpHeaders headers = getHttpHeaders();
        final  HttpEntity<Integer> entity = new HttpEntity<>(requestBody,headers);
        return restTemplate.exchange(endpoint() + path, HttpMethod.GET, entity, Object.class);
    }

    public ResponseEntity<Object>  postContent(String path, String doc) {
        HttpHeaders headers = getHttpHeaders();
        HttpEntity<String> entity = new HttpEntity<>(doc , headers);
        return restTemplate.exchange(endpoint() + path, HttpMethod.POST, entity, Object.class);
    }

    public ResponseEntity<Object>  postContent(String path, Integer doc) {
        HttpHeaders headers = getHttpHeaders();
        HttpEntity<Integer> entity = new HttpEntity<>(doc, headers);
        return restTemplate.exchange(endpoint() + path, HttpMethod.POST, entity, Object.class);
    }

    public ResponseEntity<Object>  deleteContent(String path) {
        HttpHeaders headers = getHttpHeaders();
        final  HttpEntity<HttpHeaders> entity = new HttpEntity<>(headers);
        return restTemplate.exchange(endpoint() + path, HttpMethod.DELETE, entity, Object.class);
    }

    public ResponseEntity<Object>  putContent(String path, JsonObject doc) {
        HttpHeaders headers = getHttpHeaders();
        HttpEntity<String> entity = new HttpEntity<>(doc.toString(), headers);
        return restTemplate.exchange(endpoint() + path, HttpMethod.PUT, entity, Object.class);
    }

    private HttpHeaders getHttpHeaders() {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        return headers;
    }
}