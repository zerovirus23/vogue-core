package co.zero.vogue.persistence;

import co.zero.vogue.model.Area;
import co.zero.vogue.model.Event;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by htenjo on 6/1/16.
 */
public interface AreaRepository extends PagingAndSortingRepository<Area, Long> {
}
