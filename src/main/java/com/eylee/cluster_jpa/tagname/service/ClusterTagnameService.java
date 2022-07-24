package com.eylee.cluster_jpa.tagname.service;

import com.eylee.cluster_jpa.tagname.model.ClusterEntity;
import com.eylee.cluster_jpa.tagname.repository.ClusterRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class ClusterTagnameService {
    @Autowired
    ClusterRepository clusterRepository;

    public List<ClusterEntity> getClusterList() {
        List<ClusterEntity> clusterList = clusterRepository.findAll();

        return clusterList;
    }

}
