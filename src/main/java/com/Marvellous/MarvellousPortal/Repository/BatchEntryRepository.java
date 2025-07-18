package com.Marvellous.MarvellousPortal.Repository;

import com.Marvellous.MarvellousPortal.Entity.BatchEntry;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BatchEntryRepository extends MongoRepository<BatchEntry, ObjectId>
{

}
