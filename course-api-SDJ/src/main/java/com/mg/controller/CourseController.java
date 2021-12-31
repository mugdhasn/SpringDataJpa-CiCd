//package com.mg.controller;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.mg.model.Course;
//import com.mg.model.Topic;
//import com.mg.service.CourseService;
//
//@RestController
//public class CourseController {
//
//	@Autowired
//	private CourseService courseservice;
//	
//	@RequestMapping("/topics/{id}/courses")
//	public List<Course> getAllCourse(@PathVariable String id) {
//		return courseservice.getAllCourses(id);
//	}
//	
////	@RequestMapping("/topics/{id}")
////	public Topic getTopic(@PathVariable String id) {
////		return courseservice.getTopic(id);
////	}
//	
//	@RequestMapping(method=RequestMethod.POST, value = "/topics/{topicId}/courses")
//	public void addCourse(@RequestBody Course topic,@PathVariable String topicId) {
//		topic.setTopic(new Topic(topicId,"",""));
//		courseservice.addCourse(topic);
//	}
//	
//	@RequestMapping(method=RequestMethod.PUT, value = "/topics/{topicId}/courses/{id}")
//	public void updateCourse(@RequestBody Course topic, @PathVariable String id,@PathVariable String topicId) {
//		topic.setTopic(new Topic(topicId,"",""));
//		courseservice.updateCourse(topic);
//	}
//	
//	@RequestMapping(method=RequestMethod.DELETE, value="/topics/{topicId}/courses/{id}")
//	public void deleteTopic(@PathVariable String id) {
//		 courseservice.deleteCourse(id);
//	}
//	
//}
