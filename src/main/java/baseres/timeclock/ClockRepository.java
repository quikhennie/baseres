package baseres.timeclock;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface ClockRepository extends CrudRepository<Clock, Long> {
	
	Clock findByUserId(String userId);
	Clock findById(Long id);
	List<Clock> findAll();

}
