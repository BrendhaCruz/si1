package models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

import play.data.validation.Constraints.Required;
import play.db.ebean.Model;

@Entity
public class Task extends Model implements Comparable<Task>{

        @Id
        public Long id;

        @Required
        public String label;
        
        @Required
        public String projeto;
       
        @Required
        public int prioridade;
        
        public String tarefaFeita = "false";
        
        public static Finder<Long, Task> find = new Finder(Long.class, Task.class);

        public static List<Task> all() {
                return find.all();
        }

        public static void create(Task task) {
                task.save();
        }

        public static void delete(Long id) {
                find.ref(id).delete();
        }
        
        
        public static void update(Long id) {
            Task task = find.ref(id);
            if (task.tarefaFeita .equals("true")) {
                    task.tarefaFeita  = "false";
            } else{
                    task.tarefaFeita  = "true";
            }
            task.update();
    }

    @Override
    public int compareTo(Task t) {
            return prioridade - t.prioridade;
    }
}