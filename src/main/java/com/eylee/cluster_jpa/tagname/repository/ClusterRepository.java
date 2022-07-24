package com.eylee.cluster_jpa.tagname.repository;

import com.eylee.cluster_jpa.tagname.model.ClusterEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClusterRepository extends JpaRepository<ClusterEntity, Integer> {
}
