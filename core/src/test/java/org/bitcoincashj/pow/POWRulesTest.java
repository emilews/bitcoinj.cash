package org.bitcoincashj.pow;

import org.bitcoincashj.core.NetworkParameters;
import org.bitcoincashj.pow.factory.RuleCheckerFactory;
import org.junit.Test;

public class POWRulesTest {
    private final NetworkParameters regTestParams = NetworkParameters.fromID(NetworkParameters.ID_REGTEST);

    // regtest network does not have pow rule
    @Test public void testRegtestPOW() throws Exception {
        AbstractRuleCheckerFactory ruleCheckerFactory = RuleCheckerFactory.create(regTestParams);
        AbstractPowRulesChecker rulesChecker = ruleCheckerFactory.getRuleChecker(null, null);
        rulesChecker.checkRules(null, null, null, null);
    }
}
