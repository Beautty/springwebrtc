package com.webrtc.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.webrtc.model.Contact;
import com.webrtc.model.Employee;
import com.webrtc.model.Openid;

@Repository("contactDao")
public class ContactDaoImpl implements ContactDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void addContact(Contact contact) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().saveOrUpdate(contact);
	}

	@SuppressWarnings("unchecked")
	public List<Contact> listContactss() {
		// TODO Auto-generated method stub
		
		return (List<Contact>) sessionFactory.getCurrentSession().createCriteria(Contact.class).list();

	}

	@Override
	public Contact getContact(String sipuri) {
		// TODO Auto-generated method stub
		return (Contact) sessionFactory.getCurrentSession().get(Contact.class, sipuri);
	}

	@Override
	public void deleteContact(Contact contact) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().createQuery("DELETE FROM Conatct WHERE contactsipuri = "+contact.getContactsipuri()).executeUpdate();

	}


}
