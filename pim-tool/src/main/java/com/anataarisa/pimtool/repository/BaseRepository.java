package com.anataarisa.pimtool.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BaseRepository<T> extends JpaRepository<T, Number>{
    
}
