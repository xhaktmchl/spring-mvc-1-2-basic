package hello.springmvc12basic.basic.response;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/*
뷰 템플릿으로 응답 방법 3가지
 */
@Slf4j
@Controller
public class ResponseViewController {

    /*
    버전 1 : ModelAndView 객체로 응답
     */
    @RequestMapping("/response-view-v1")
    public ModelAndView responseViewV1() {
        ModelAndView mav = new ModelAndView("response/hello")
                .addObject("data", "hello!");
        return mav;
    }

    /*
    실무에서 주로 사용 !!!!
    버전2 : 뷰 템플릿 논리주소로 응답
     */
    @RequestMapping("/response-view-v2")
    public String responseViewV2(Model model) {
        model.addAttribute("data", "hello!!");
        return "response/hello";
    }

    /*
    버전 3 : 논리주소 까지 생략, 비추천
     */
    @RequestMapping("/response/hello")
    public void responseView3(Model model){
        model.addAttribute("data", "hello!!!!");
    }
}
