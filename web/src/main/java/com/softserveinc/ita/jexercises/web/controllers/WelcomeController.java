package com.softserveinc.ita.jexercises.web.controllers;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Controls welcome page.
 *
 * @author Volodymyr Yakymiv
 * @version 1.0
 */
@Controller
public class WelcomeController {

    /**
     * Getting welcome view.
     *
     * @return ModelAndView Welcome page or redirect to /tests.
     */
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String welcomeForm() {
            return "/resources/app/index.html";
        }

    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public String adminForm() {
        return "/resources/app/admin/index.html";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login() {
        return "/resources/app/login.html";
    }
}