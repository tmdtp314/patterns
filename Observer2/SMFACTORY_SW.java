package Observer2;

import java.util.ArrayList;
import java.util.List;

public class SMFACTORY_SW implements TASK{

    private List<Crew> crews = new ArrayList<>();
    public void updateProject(){
        System.out.println("SW 기존 화면이 수정되었습니다.");
        notifyCrew("SW업체 프로젝트 수정");
    }

    public void createProject(){
        System.out.println("SW 새 화면이 추가되었습니다.");
        notifyCrew("SW 화면 추가");
    }

    public void deleteProject(){
        System.out.println("SW 기존 화면을 삭제하였습니다.");
        notifyCrew("SW 화면 삭제");

    }
    @Override
    public void subscribe(Crew crew) {
        crews.add(crew);
        
    }

    @Override
    public void unsubscribe(Crew crew) {
        crews.remove(crew);        
    }

    @Override
    public void notifyCrew(String msg) {
        crews.forEach(crew->crew.update(msg));
        
    }
    
}
