package com.lacus.admin.controller.tools;

import com.lacus.common.core.base.BaseController;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * swagger 接口
 */
@Controller
@RequestMapping("/tools/swagger")
public class SwaggerController extends BaseController {

    @PreAuthorize("@permission.has('tool:swagger:view')")
    @GetMapping()
    public String index() {
        return redirect("/swagger-ui.html");
    }
}
