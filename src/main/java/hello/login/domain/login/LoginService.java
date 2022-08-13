package hello.login.domain.login;
import hello.login.domain.member.Member;
import hello.login.domain.member.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
@Service
@RequiredArgsConstructor
public class LoginService {
    private final MemberRepository memberRepository;

    // return이 null이면 로그인 실패
    public Member login(String loginId, String password) {
        /**
         *  Optional<Member> findMemberOptional = memberRepository.findByLoginId(loginId);
         *  Member member = findMemberOptional.get();
         *  if(member.getPassword().equals(password)) {
         *      return member;
         *  } else {
         *      return null;
         *  }
         *  위와 같은 코드를 Optional을 이용하면 아래와 같이 쉽게 쓸 수 있음
         */
        return memberRepository.findByLoginId(loginId)
                .filter(m->m.getPassword().equals(password))
                .orElse(null);
    }
}
