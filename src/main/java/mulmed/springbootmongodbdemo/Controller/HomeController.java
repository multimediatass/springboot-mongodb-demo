//package mulmed.springbootmongodbdemo.Controller;
//
//
//import mulmed.springbootmongodbdemo.Entity.User;
//import org.springframework.context.annotation.Bean;
//import org.springframework.stereotype.Controller;
//import org.springframework.validation.BindingResult;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.servlet.ViewResolver;
//import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
//import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
//import org.springframework.web.servlet.view.InternalResourceViewResolver;
//
//import javax.validation.Valid;
//
//@Controller
//@RequestMapping("/login")
//public class HomeController extends WebMvcConfigurerAdapter {
//
//    @Override
//    public void addViewControllers(ViewControllerRegistry registry) {
//        registry.addViewController("/index").setViewName("index");
//        registry.addViewController("/results").setViewName("results");
//        registry.addViewController("/login").setViewName("login");
//        registry.addViewController("/form").setViewName("form");
//    }
//
//    @RequestMapping(value="/", method = RequestMethod.GET)
//    public String getHomePage(){
//        return "home";
//    }
//
//    @RequestMapping(value="/login", method=RequestMethod.GET)
//    public String showForm(User person) {
//        return "login";
//    }
//
//    @RequestMapping(value="/form", method=RequestMethod.POST)
//    public String checkPersonInfo(@Valid User person, BindingResult bindingResult) {
//
//        if (bindingResult.hasErrors()) {
//            return "login";
//        }
//        return "redirect:/results";
//    }
//
//    @Bean
//    public ViewResolver getViewResolver() {
//        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
//        resolver.setPrefix("templates/");
//        //resolver.setSuffix(".html");
//        return resolver;
//    }
//
//    @Override
//    public void configureDefaultServletHandling(
//            DefaultServletHandlerConfigurer configurer) {
//        configurer.enable();
//    }
//
//}
//
