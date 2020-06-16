package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Translator {
    @GetMapping("/trans")
    public String getResult(@RequestParam String english, Model model){
        String vietnamese = "";
        switch (english) {
            case "hello":
                vietnamese = "Xin chào";
                break;
            case "Breath":
                vietnamese = "Thở";
                break;
            case "fuck":
                vietnamese = "***";
                break;
            default:
                vietnamese = "Đéo biết";
                break;
        }
        model.addAttribute("english",english);
        model.addAttribute("vietnamese",vietnamese);
        return "result";
    }
}
