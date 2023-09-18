package lk.ijse.gdse.new_springmvc_assingment.api;

import lk.ijse.gdse.new_springmvc_assingment.service.TeachLeadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@RestController
@RequestMapping("api/v1teachLead")
public class TeachLeadController extends HttpServlet {

    @Autowired
    TeachLeadService teachLeadService;

}