//package com.mg.service;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.springframework.stereotype.Service;
//
//import com.mg.db.CourseRepository;
//import com.mg.model.Course;
//
//@Service
//public class CourseService {
//	
//	private CourseRepository cr;
//
//	public List<Course> getAllCourses(String topicId) {
//		//return topics;
//		List<Course>topics=new ArrayList<>();
//		cr.findByTopicId(topicId)
//		.forEach(topics::add);
//		return topics;
//	}
//
////	public Topic getTopic(String id) {
////
////		return topics.stream().filter(m -> m.getId().equals(id)).findFirst().get();
////
////	}
//
//	public void addCourse(Course topic) {
//		// TODO Auto-generated method stub
//		//topics.add(topic);
//		cr.save(topic);
//		
//	}
//
//	public void updateCourse(Course topic) {
//		// TODO Auto-generated method stub
////		for(int i=0;i<topics.size();i++) {
////			Topic m=topics.get(i);
////			if(m.getId().equals(id)) {
////				topics.set(i, topic); //at that id setting this new topic in payload/req body
////				return ;
////			}
////		}
//		cr.save(topic);
//		
//	}
//
//	public void deleteCourse(String id) {
//		// TODO Auto-generated method stub
//		//.removeIf(m->m.getId().equals(id)); //predicate interface method
//		cr.deleteById(id);
//	}
//}
