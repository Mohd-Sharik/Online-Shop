package com.onlineShop.example.commonUtilMethods;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;

/**
 *
 *
 *@author MohdSharik
 * @param <T>
 */

@Component
public class FilterUtil<T> {
	
	
	public Specification<T> getSpecification(List<SearchCriteria> list)
	{
		return new Specification<T>() {

			@Override
			public Predicate toPredicate(Root<T> root, CriteriaQuery<?> query, CriteriaBuilder builder) {
				List<Predicate> predicates = new ArrayList<>();
				for(SearchCriteria criteria : list)
				{
					switch(criteria.getOperation())
					{
					case EQUAL:
						predicates.add(builder.equal(root.get(criteria.getKey()), criteria.getValue()));
						break;
						
					case COMPOSITE:
						predicates.add(builder.equal(root.get(criteria.getKey()).get(criteria.getSecondKey()), criteria.getValue()));
						break;
						
					case NESTED_COMPOSITE:
						predicates.add(builder.equal(root.get(criteria.getKey()).get(criteria.getSecondKey()).get(criteria.getSecondSecondryKey()), criteria.getValue()));
						break;
						
					case LESS_THAN:
						predicates.add(builder.lessThan(root.get(criteria.getKey()),criteria.getValue().toString()));
						break;
						
					case GREATER_THAN:
						predicates.add(builder.greaterThan(root.get(criteria.getKey()), criteria.getValue().toString()));
						break;
						
					case MATCH_START:
						predicates.add(builder.like(builder.lower( root.get(criteria.getKey())),"%"+criteria.getValue().toString().toLowerCase()));
						break;
						
					case MATCH_END:
						predicates.add(builder.like(builder.lower(root.get(criteria.getKey())), criteria.getValue().toString().toLowerCase()+"%"));
						break;
						
					case MATCH:
						predicates.add(builder.like(builder.lower(root.get(criteria.getKey())), "%"+criteria.getValue().toString().toLowerCase()+"%"));
						break;
						
						default:
							break;
						
					}
					
				}
				
				 return builder.and(predicates.toArray(new Predicate[predicates.size()]));
			}
	};
	}

}
