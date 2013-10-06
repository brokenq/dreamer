package com.dreamer.edu.repository;

import java.io.Serializable;

import javax.persistence.EntityManager;

import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

/**
 * 数据访问仓库实现基类
 * @param <T>
 * @param <ID>
 * @since 2013-10-5 下午3:39:16
 * @author broken_xie
 */
@NoRepositoryBean
public class DreamerRepImpl<T, ID extends Serializable> extends SimpleJpaRepository<T, ID> implements DreamerRep<T, ID> {
    
    private EntityManager entityManager;
    
    public DreamerRepImpl(Class<T> domainClass, EntityManager entityManager) {
        super(domainClass, entityManager);
        this.entityManager = entityManager;
    }
}
