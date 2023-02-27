package com.greatlearning.studentmgmtsys.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.greatlearning.studentmgmtsys.model.User;
import com.greatlearning.studentmgmtsys.repository.UserRepository;
import com.greatlearning.studentmgmtsys.security.MyUserDetails;



public class UserDetailsServiceImpl implements UserDetailsService {

	   @Autowired
	    private UserRepository userRepository;
	     
	    @Override
	    public UserDetails loadUserByUsername(String username)
	            throws UsernameNotFoundException {
	        User user = userRepository.getUserByUsername(username);
	         
	        if (user == null) {
	            throw new UsernameNotFoundException("Could not find user");
	        }
	         
	        return  MyUserDetails(user);
	    }

		private UserDetails MyUserDetails(User user) {
			// TODO Auto-generated method stub
			return null;
		}

}
