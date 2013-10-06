package com.dreamer.edu.repository.factory;

import java.io.Serializable;

import javax.persistence.EntityManager;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.JpaRepositoryFactory;
import org.springframework.data.jpa.repository.support.JpaRepositoryFactoryBean;
import org.springframework.data.repository.core.RepositoryMetadata;
import org.springframework.data.repository.core.support.RepositoryFactorySupport;

import com.dreamer.edu.repository.DreamerRep;
import com.dreamer.edu.repository.DreamerRepImpl;

/**
 * 数据仓库工厂
 * @param <R> 数据访问仓库
 * @param <T> 数据访问对象
 * @param <ID>
 * @since 2013-9-6 下午1:48:15
 * @author broken_xie
 */
public class DreamerRepositoryFactoryBean<R extends JpaRepository<T, ID>, T, ID extends Serializable> extends JpaRepositoryFactoryBean<R, T, ID> {
    
    @Override
    protected RepositoryFactorySupport createRepositoryFactory(EntityManager entityManager) {
        return super.createRepositoryFactory(entityManager);
    }
    
    @SuppressWarnings("unused")
    private static class DreamerRepositoryFactory<T, ID extends Serializable> extends JpaRepositoryFactory {
        
        private EntityManager entityManager;
        
        public DreamerRepositoryFactory(EntityManager entityManager) {
            super(entityManager);
            this.entityManager = entityManager;
        }
        
        @SuppressWarnings({"hiding", "unchecked"})
        @Override
        protected <T, ID extends Serializable> JpaRepository<?, ?> getTargetRepository(RepositoryMetadata metadata, EntityManager entityManager) {
            return new DreamerRepImpl<T, ID>((Class<T>) metadata.getDomainClass(), entityManager);
        }
        
        @Override
        protected Class<?> getRepositoryBaseClass(RepositoryMetadata metadata) {
            return DreamerRep.class;
        }
        
    }
}
