package com.mg.db;

import org.springframework.data.repository.CrudRepository;

import com.mg.model.Topic;

public interface TopicRepository extends CrudRepository<Topic,String>
{
	
}
