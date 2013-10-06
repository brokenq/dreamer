package com.dreamer.edu.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.NoRepositoryBean;

/**
 * 数据访问仓库基类
 * @param <T> 数据访问对象
 * @param <ID>
 * @since 2013-9-6 下午1:32:37
 * @author broken_xie
 */
@NoRepositoryBean
public interface DreamerRep<T, ID extends Serializable> extends JpaRepository<T, ID>, JpaSpecificationExecutor<T> {
    
}
