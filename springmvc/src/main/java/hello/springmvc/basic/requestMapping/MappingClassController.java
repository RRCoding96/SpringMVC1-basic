package hello.springmvc.basic.requestMapping;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mapping/users")
public class MappingClassController {

    /**
     * 회원목록조회: GET      /mapping/users
     * 회원등록:    POST     /mapping/users
     * 회원조회:    GET      /mapping/users/id1
     * 회원수정:    PATCH    /mapping/users/id1
     * 회원삭제:    DELETE   /mapping/users/id1
     */

    @GetMapping
    public String users() {
        return "get users";
    }

    @PostMapping
    public String addUser() {
        return "post user";
    }

    @GetMapping("/{userId}")
    public String findUser(@PathVariable String userId) {
        return "get userId=" + userId;
    }

    @PatchMapping("/{userId}")
    public String updateUser(@PathVariable String userId) {
        return "update userId=" + userId;
    }

    @DeleteMapping("/{userId}")
    public String deleteUser(@PathVariable String userId) {
        return "delete userId=" + userId;
    }
}
