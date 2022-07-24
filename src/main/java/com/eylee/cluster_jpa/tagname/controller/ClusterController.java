package com.eylee.cluster_jpa.tagname.controller;

import com.eylee.cluster_jpa.common.CommonResponseVo;
import com.eylee.cluster_jpa.tagname.model.ClusterEntity;
import com.eylee.cluster_jpa.tagname.service.ClusterTagnameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/cluster")
@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ClusterController {

    @Autowired
    ClusterTagnameService clusterTagnameService;

    @GetMapping("")
    public CommonResponseVo clusterTest(){

        return new CommonResponseVo(clusterTagnameService.getClusterList());
    }


}
