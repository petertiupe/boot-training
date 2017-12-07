package de.tiupe.boottraining;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/restuser")
public class RestUserController {

    @Autowired
    UserRepository userRepo;

    @RequestMapping(method=RequestMethod.POST, produces="application/json", consumes = "application/json")
    public @ResponseBody User addUser(@RequestBody User aUser) {
        User myUser = this.userRepo.save(aUser);
        return myUser;
    }

}
