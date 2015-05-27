package baseres.timeclock;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class ClockService {
	
	@Autowired
	ClockRepository repo;
	
	@RequestMapping("/clocks")
    public List<Clock> clocks() {
    	return repo.findAll();
    }
	
	@RequestMapping(value="/clock/{id}", method=RequestMethod.GET)
    public Clock getClock(@PathVariable Long id) {
		return repo.findById(id);
	}
	
	@RequestMapping(value="/clock/{id}", method=RequestMethod.DELETE)
    public void deleteClock(@PathVariable Long id) {
		Clock clock = repo.findById(id);
		repo.delete(clock);
	}
	
	@RequestMapping(value="/clock", method=RequestMethod.POST)
    @ResponseBody
    public Clock createClock(@RequestBody Clock clock) {
		return repo.save(clock);
    }

}
