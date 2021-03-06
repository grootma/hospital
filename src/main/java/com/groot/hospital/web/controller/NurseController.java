package com.groot.hospital.web.controller;

import com.alibaba.fastjson.JSON;
import com.groot.hospital.common.utils.ResultMessage;
import com.groot.hospital.web.entity.Nurse;
import com.groot.hospital.web.service.IGradeService;
import com.groot.hospital.web.service.INurseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * <p>
 * 护士 前端控制器
 * </p>
 *
 * @author groot
 * @since 2019-04-16
 */
@Controller
@RequestMapping("/web/nurse")
@Slf4j
public class NurseController {

    @Autowired
    INurseService nurseService;

    @Autowired
    IGradeService gradeService;

    @RequestMapping("/index")
    public String nurseIndex(Model model){
        model.addAttribute("gradeList",gradeService.list());
        return "nurse/nurse";
    }

    @ResponseBody
    @RequestMapping("list")
    public ResultMessage getList(){
        List<Nurse> list = nurseService.list();
        log.info(JSON.toJSONString(ResultMessage.success().setData(list)));
        return ResultMessage.success().setData(list);
    }

    @RequestMapping("addNurse")
    public String addNurse(ModelAndView modelAndView){
        modelAndView.addObject("gradeList",gradeService.list());
        return "nurse/addNurse";
    }

}

