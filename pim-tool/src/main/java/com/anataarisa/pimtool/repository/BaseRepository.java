package com.anataarisa.pimtool.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BaseRepository<T> extends JpaRepository<T, Number>{
    public List<T> getAll();
}
