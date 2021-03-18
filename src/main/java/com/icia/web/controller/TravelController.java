package com.icia.web.controller;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.icia.common.util.StringUtil;
import com.icia.web.model.Travel;
import com.icia.web.service.TravelService;
import com.icia.web.util.CookieUtil;
import com.icia.web.util.HttpUtil;

@Controller("TravelController")
public class TravelController {

   private static Logger logger = LoggerFactory.getLogger(HiBoardController.class);
   
   @Value("#{env['auth.cookie.name']}")
   private String AUTH_COOKIE_NAME;
   
   @Autowired
   private TravelService travelService;
   
   @RequestMapping(value="/")
   public String mainHome(ModelMap model, HttpServletRequest request, HttpServletResponse response)
   {
      String cookieUserId2 = CookieUtil.getHexValue(request, AUTH_COOKIE_NAME);
      String userName2 = HttpUtil.get(request, "userName2");
      
      Travel travel = travelService.userSelect3(cookieUserId2);
      
      travel.setUserName2(userName2);
      
      model.addAttribute("travel", travel);
      model.addAttribute("userName2", userName2);
      
      
      
      return "/";
   }
   @RequestMapping(value="/travel/design/jeju")
   public String jeju(ModelMap model, HttpServletRequest request, HttpServletResponse response)
   {
      return "/travel/design/jeju";
   }
   
   @RequestMapping(value="/travel/design/busan")
   public String busan(ModelMap model, HttpServletRequest request, HttpServletResponse response)
   {
      return "/travel/design/busan";
   }
   
   @RequestMapping(value="/travel/design/incheon")
   public String incheon(ModelMap model, HttpServletRequest request, HttpServletResponse response)
   {
      return "/travel/design/incheon";
   }
   
   @RequestMapping(value="/travel/design/gapyeong")
   public String gapyeong(ModelMap model, HttpServletRequest request, HttpServletResponse response)
   {
      return "/travel/design/gapyeong";
   }
   
   @RequestMapping(value="/travel/design/gyeongju")
   public String gyeongju(ModelMap model, HttpServletRequest request, HttpServletResponse response)
   {
      return "/travel/design/gyeongju";
   }
   
   @RequestMapping(value="/travel/design/seoul")
   public String seoul(ModelMap model, HttpServletRequest request, HttpServletResponse response)
   {
      return "/travel/design/seoul";
   }
   
   @RequestMapping(value="/travel/design/banner1")
   public String banner1(ModelMap model, HttpServletRequest request, HttpServletResponse response)
   {
      return "/travel/design/banner1";
   }
   
   @RequestMapping(value="/travel/design/banner2")
   public String banner2(ModelMap model, HttpServletRequest request, HttpServletResponse response)
   {
      return "/travel/design/banner2";
   }
   
   @RequestMapping(value="/travel/design/useMethod")
   public String UseMethod(ModelMap model, HttpServletRequest request, HttpServletResponse response)
   {
      return "/travel/design/useMethod";
   }
}