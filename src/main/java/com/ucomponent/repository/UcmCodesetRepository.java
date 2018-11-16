package com.ucomponent.repository;

import java.util.List;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ucomponent.po.UcmCodeset;
/**
 * 
 * @author 代码老哥
 *
 */
@Repository
public abstract interface UcmCodesetRepository  extends JpaRepository<UcmCodeset, Integer>{
  
  public abstract List<UcmCodeset> findByStatusOrderBySeq(int use);
  
  public abstract List<UcmCodeset> findByStatusOrStatusOrderBySeq(int use,int nouse);
  
  public abstract List<UcmCodeset> findByPCodeAndStatusOrderBySeq(String pcode,int status);
}