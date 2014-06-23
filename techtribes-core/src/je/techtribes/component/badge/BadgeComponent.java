package je.techtribes.component.badge;

import com.structurizr.annotation.Component;
import je.techtribes.domain.ContentSource;
import je.techtribes.domain.badge.AwardedBadge;

import java.util.List;

@Component(description = "Manages the badges that have been awarded to people and tribes.")
public interface BadgeComponent {

    List<AwardedBadge> getAwardedBadges();

    List<AwardedBadge> getAwardedBadges(ContentSource contentSource);

    void add(AwardedBadge badge);

    List<AwardedBadge> getRecentAwardedBadges(int pageSize);

}
