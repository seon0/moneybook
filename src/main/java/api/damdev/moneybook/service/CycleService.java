package api.damdev.moneybook.service;

import api.damdev.moneybook.domain.Cycle;
import api.damdev.moneybook.dto.cycle.CycleInfo;

public interface CycleService {
    Cycle insertCycle(CycleInfo addInfo);

    Cycle updateCycle(CycleInfo addInfo, String id);
}