package sk.upjs.paz;

import java.util.List;

public class UserService {
    private final List<User> database;

    public UserService(List<User> database) {
        this.database = database;
    }

    public GenderRatio comuteGenderRation() {
        double count_boys = 0;
        double count_girls = 0;
        double count_unknown = 0;
        for (User user : database) {
            if (user.gender() == User.Gender.MALE) {
                count_boys++;
            }
            if (user.gender() == User.Gender.FEMALE) {
                count_girls++;
            }
            if (user.gender() == User.Gender.UNKNOWN) {
                count_unknown++;
            }
        }
        double total = count_boys+count_girls+count_unknown;
        return new GenderRatio(count_boys/total, count_girls/total, count_unknown/total);
    }
}
