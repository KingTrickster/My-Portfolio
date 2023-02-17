package com.trxjster.portfoliobackend.api.v1;

import com.trxjster.portfoliobackend.service.ProjectService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ResponseBody
@RequestMapping("/Projects")
@AllArgsConstructor
public class ProjectController {

    private ProjectService projectService;

}
