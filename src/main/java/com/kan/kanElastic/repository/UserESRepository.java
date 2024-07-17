package com.kan.kanElastic.repository;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import com.kan.kanElastic.vo.UserES;
@Repository
public interface UserESRepository extends ElasticsearchRepository<UserES,String>{
    
}