package de.gedoplan.workshop.persistence;

import de.gedoplan.workshop.domain.Talk;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;

@ApplicationScoped
@Transactional
public class TalkRepository extends SingleIdEntityRepository<Integer, Talk>
{
}
