package it.consoft.item;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

import it.consoft.model.Person;

public class PersonItemProcessor implements ItemProcessor<Person, Person> {

	private static final Logger log = LoggerFactory.getLogger(PersonItemProcessor.class);
	
	@Override
	public Person process(final Person person) throws Exception {
		final Person transformedPerson = new Person(person.getName().toUpperCase(), person.getSurname().toUpperCase());
		log.info("Converting(" + person + ") into ( " + transformedPerson + ")");
		return transformedPerson ;
	}

}
