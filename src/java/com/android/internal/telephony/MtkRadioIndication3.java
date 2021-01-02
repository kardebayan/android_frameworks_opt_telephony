package com.android.internal.telephony;

import android.hardware.radio.V1_0.SetupDataCallResult;

import java.util.ArrayList;

import vendor.mediatek.hardware.radio.V3_0.*;

public class MtkRadioIndication3 extends IRadioIndication.Stub {
    RIL mRil;
    RadioIndication mIndication;

    MtkRadioIndication3(RIL ril, RadioIndication indication) {
        mRil = ril;
        mIndication = indication;
    }

    //++ Radio V1_0
    public void radioStateChanged(int type, int radioState) {
        mIndication.radioStateChanged(type, radioState);
    }

    public void callStateChanged(int type) {
        mIndication.callStateChanged(type);
    }

    public void networkStateChanged(int type) {
        mIndication.networkStateChanged(type);
    }

    public void newSms(int type, ArrayList<Byte> pdu) {
        mIndication.newSms(type, pdu);
    }

    public void newSmsStatusReport(int type, ArrayList<Byte> pdu) {
        mIndication.newSmsStatusReport(type, pdu);
    }

    public void newSmsOnSim(int type, int recordNumber) {
        mIndication.newSmsOnSim(type, recordNumber);
    }

    public void onUssd(int type, int modeType, String msg) {
        mIndication.onUssd(type, modeType, msg);
    }

    public void nitzTimeReceived(int type, String nitzTime, long receivedTime) {
        mIndication.nitzTimeReceived(type, nitzTime, receivedTime);
    }

    public void currentSignalStrength(int type, android.hardware.radio.V1_0.SignalStrength signalStrength) {
        mIndication.currentSignalStrength(type, signalStrength);
    }

    public void dataCallListChanged(int type, ArrayList<SetupDataCallResult> dcList) {
        mIndication.dataCallListChanged(type, dcList);
    }

    public void suppSvcNotify(int type, android.hardware.radio.V1_0.SuppSvcNotification suppSvc) {
        mIndication.suppSvcNotify(type, suppSvc);
    }

    public void stkSessionEnd(int type) {
        mIndication.stkSessionEnd(type);
    }

    public void stkProactiveCommand(int type, String cmd) {
        mIndication.stkProactiveCommand(type, cmd);
    }

    public void stkEventNotify(int type, String cmd) {
        mIndication.stkEventNotify(type, cmd);
    }

    public void stkCallSetup(int type, long timeout) {
        mIndication.stkCallSetup(type, timeout);
    }

    public void simSmsStorageFull(int type) {
        mIndication.simSmsStorageFull(type);
    }

    public void simRefresh(int type, android.hardware.radio.V1_0.SimRefreshResult refreshResult) {
        mIndication.simRefresh(type, refreshResult);
    }

    public void callRing(int type, boolean isGsm, android.hardware.radio.V1_0.CdmaSignalInfoRecord record) {
        mIndication.callRing(type, isGsm, record);
    }

    public void simStatusChanged(int type) {
        mIndication.simStatusChanged(type);
    }

    public void cdmaNewSms(int type, android.hardware.radio.V1_0.CdmaSmsMessage msg) {
        mIndication.cdmaNewSms(type, msg);
    }

    public void newBroadcastSms(int type, ArrayList<Byte> data) {
        mIndication.newBroadcastSms(type, data);
    }

    public void cdmaRuimSmsStorageFull(int type) {
        mIndication.cdmaRuimSmsStorageFull(type);
    }

    public void restrictedStateChanged(int type, int state) {
        mIndication.restrictedStateChanged(type, state);
    }

    public void enterEmergencyCallbackMode(int type) {
        mIndication.enterEmergencyCallbackMode(type);
    }

    public void cdmaCallWaiting(int type, android.hardware.radio.V1_0.CdmaCallWaiting callWaitingRecord) {
        mIndication.cdmaCallWaiting(type, callWaitingRecord);
    }

    public void cdmaOtaProvisionStatus(int type, int status) {
        mIndication.cdmaOtaProvisionStatus(type, status);
    }

    public void cdmaInfoRec(int type, android.hardware.radio.V1_0.CdmaInformationRecords records) {
        mIndication.cdmaInfoRec(type, records);
    }

    public void indicateRingbackTone(int type, boolean start) {
        mIndication.indicateRingbackTone(type, start);
    }

    public void resendIncallMute(int type) {
        mIndication.resendIncallMute(type);
    }

    public void cdmaSubscriptionSourceChanged(int type, int cdmaSource) {
        mIndication.cdmaSubscriptionSourceChanged(type, cdmaSource);
    }

    public void cdmaPrlChanged(int type, int version) {
        mIndication.cdmaPrlChanged(type, version);
    }

    public void exitEmergencyCallbackMode(int type) {
        mIndication.exitEmergencyCallbackMode(type);
    }

    public void rilConnected(int type) {
        mIndication.rilConnected(type);
    }

    public void voiceRadioTechChanged(int type, int rat) {
        mIndication.voiceRadioTechChanged(type, rat);
    }

    public void cellInfoList(int type, ArrayList<android.hardware.radio.V1_0.CellInfo> records) {
        mIndication.cellInfoList(type, records);
    }

    public void imsNetworkStateChanged(int type) {
        mIndication.imsNetworkStateChanged(type);
    }

    public void subscriptionStatusChanged(int type, boolean activate) {
        mIndication.subscriptionStatusChanged(type, activate);
    }

    public void srvccStateNotify(int type, int state) {
        mIndication.srvccStateNotify(type, state);
    }

    public void hardwareConfigChanged(int type, ArrayList<android.hardware.radio.V1_0.HardwareConfig> configs) {
        mIndication.hardwareConfigChanged(type, configs);
    }

    public void radioCapabilityIndication(int type, android.hardware.radio.V1_0.RadioCapability rc) {
        mIndication.radioCapabilityIndication(type, rc);
    }

    public void onSupplementaryServiceIndication(int type, android.hardware.radio.V1_0.StkCcUnsolSsResult ss) {
        mIndication.onSupplementaryServiceIndication(type, ss);
    }

    public void stkCallControlAlphaNotify(int type, String alpha) {
        mIndication.stkCallControlAlphaNotify(type, alpha);
    }

    public void lceData(int type, android.hardware.radio.V1_0.LceDataInfo lce) {
        mIndication.lceData(type, lce);
    }

    public void pcoData(int type, android.hardware.radio.V1_0.PcoDataInfo pco) {
        mIndication.pcoData(type, pco);
    }

    public void modemReset(int type, String reason) {
        mIndication.modemReset(type, reason);
    }
    //-- Radio V1_0

    //++ Radio V1_1
    public void carrierInfoForImsiEncryption(int type) {
        mIndication.carrierInfoForImsiEncryption(type);
    }

    public void networkScanResult(int type, android.hardware.radio.V1_1.NetworkScanResult result) {
        mIndication.networkScanResult(type, result);
    }

    public void keepaliveStatus(int type, android.hardware.radio.V1_1.KeepaliveStatus status) {
        mIndication.keepaliveStatus(type, status);
    }
    //-- Radio V1_1

    //++ Radio V1_2
    public void networkScanResult_1_2(int type, android.hardware.radio.V1_2.NetworkScanResult result) {
        mIndication.networkScanResult_1_2(type, result);
    }
    
    public void cellInfoList_1_2(int type, ArrayList<android.hardware.radio.V1_2.CellInfo> records) {
        mIndication.cellInfoList_1_2(type, records);
    }
    
    public void currentLinkCapacityEstimate(int type, android.hardware.radio.V1_2.LinkCapacityEstimate lce) {
        mIndication.currentLinkCapacityEstimate(type, lce);
    }
    
    public void currentPhysicalChannelConfigs(int type, ArrayList<android.hardware.radio.V1_2.PhysicalChannelConfig> configs) {
        mIndication.currentPhysicalChannelConfigs(type, configs);
    }
    
    public void currentSignalStrength_1_2(int type, android.hardware.radio.V1_2.SignalStrength signalStrength) {
        mIndication.currentSignalStrength_1_2(type, signalStrength);
    }
    //-- radio V1_2

    //++ MTK Radio V3_0
    public void eMBMSAtInfoIndication(int type, String info) {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< eMBMSAtInfoIndication not implemented");
    }

    public void eMBMSSessionStatusIndication(int type, int status) {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< eMBMSSessionStatusIndication not implemented");
    }

    public void phbReadyNotification(int type, int isPhbReady) {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< phbReadyNotification not implemented");
    }

    public void cfuStatusNotify(int type, CfuStatusNotification cfuStatus) {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< cfuStatusNotify not implemented");
    }

    public void incomingCallIndication(int type, IncomingCallNotification inCallNotify) {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< incomingCallIndication");
        mRil.processIndication(type);
        mRil.setCallIndication(Integer.parseInt(inCallNotify.callId), Integer.parseInt(inCallNotify.seqNo));
    }

    public void cipherIndication(int type, CipherNotification cipherNotify) {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< cipherIndication not implemented");
    }

    public void crssIndication(int type, CrssNotification crssNotify) {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< crssIndication not implemented");
    }

    public void speechCodecInfoIndication(int type, int info) {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< speechCodecInfoIndication not implemented");
    }

    public void cdmaCallAccepted(int type) {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< cdmaCallAccepted not implemented");
    }

    public void eccNumIndication(int type, String ecc_list_with_card, String ecc_list_no_card) {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< eccNumIndication not implemented");
    }

    public void onVirtualSimOn(int type, int simInserted) {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< onVirtualSimOn not implemented");
    }

    public void onVirtualSimOff(int type, int simInserted) {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< onVirtualSimOff not implemented");
    }

    public void onImeiLock(int type) {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< onImeiLock not implemented");
    }

    public void onImsiRefreshDone(int type) {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< onImsiRefreshDone not implemented");
    }

    public void onSimPlugIn(int type) {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< onSimPlugIn not implemented");
    }

    public void onSimPlugOut(int type) {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< onSimPlugOut not implemented");
    }

    public void onSimMissing(int type, int simInserted) {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< onSimMissing not implemented");
    }

    public void onSimRecovery(int type, int simInserted) {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< onSimRecovery not implemented");
    }

    public void onSimTrayPlugIn(int type) {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< onSimTrayPlugIn not implemented");
    }

    public void onSimCommonSlotNoChanged(int type) {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< onSimCommonSlotNoChanged not implemented");
    }

    public void onSimMeLockEvent(int type) {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< onSimMeLockEvent not implemented");
    }

    public void onCardDetectedInd(int type) {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< onCardDetectedInd not implemented");
    }

    public void onVsimEventIndication(int type, VsimOperationEvent event) {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< onVsimEventIndication not implemented");
    }

    public void newEtwsInd(int type, EtwsNotification etws) {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< newEtwsInd not implemented");
    }

    public void meSmsStorageFullInd(int type) {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< meSmsStorageFullInd not implemented");
    }

    public void smsReadyInd(int type) {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< smsReadyInd not implemented");
    }

    public void oemHookRaw(int type, ArrayList<Byte> data) {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< oemHookRaw not implemented");
    }

    public void plmnChangedIndication(int type, ArrayList<String> plmns) {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< plmnChangedIndication not implemented");
    }

    public void registrationSuspendedIndication(int type, ArrayList<Integer> sessionIds) {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< registrationSuspendedIndication not implemented");
    }

    public void gmssRatChangedIndication(int type, ArrayList<Integer> gmsss) {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< gmssRatChangedIndication not implemented");
    }

    public void worldModeChangedIndication(int type, ArrayList<Integer> modes) {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< worldModeChangedIndication not implemented");
    }

    public void esnMeidChangeInd(int type, String esnMeid) {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< esnMeidChangeInd not implemented");
    }

    public void responseCsNetworkStateChangeInd(int type, ArrayList<String> state) {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< responseCsNetworkStateChangeInd not implemented");
    }

    public void responsePsNetworkStateChangeInd(int type, ArrayList<Integer> state) {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< responsePsNetworkStateChangeInd not implemented");
    }

    public void responseInvalidSimInd(int type, ArrayList<String> state) {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< responseInvalidSimInd not implemented");
    }

    public void responseNetworkEventInd(int type, ArrayList<Integer> event) {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< responseNetworkEventInd not implemented");
    }

    public void responseModulationInfoInd(int type, ArrayList<Integer> modulation) {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< responseModulationInfoInd not implemented");
    }

    public void dataAllowedNotification(int type, int allowed) {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< dataAllowedNotification not implemented");
    }

    public void responseFemtocellInfo(int type, ArrayList<String> info) {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< responseFemtocellInfo not implemented");
    }

    public void networkInfoInd(int type, ArrayList<String> networkinfo) {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< networkInfoInd not implemented");
    }

    public void currentSignalStrengthWithWcdmaEcioInd(int type, SignalStrengthWithWcdmaEcio signalStrength) {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< currentSignalStrengthWithWcdmaEcioInd not implemented");
    }

    public void responseLteNetworkInfo(int type, int lteBand) {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< responseLteNetworkInfo not implemented");
    }

    public void dedicatedBearerActivationInd(int type, DedicateDataCall ddcData) {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< dedicatedBearerActivationInd not implemented");
    }

    public void dedicatedBearerModificationInd(int type, DedicateDataCall ddcData) {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< dedicatedBearerModificationInd not implemented");
    }

    public void dedicatedBearerDeactivationInd(int type, int cid) {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< dedicatedBearerDeactivationInd not implemented");
    }

    public void bipProactiveCommand(int type, String cmd) {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< bipProactiveCommand not implemented");
    }

    public void triggerOtaSP(int type) {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< triggerOtaSP not implemented");
    }

    public void onStkMenuReset(int type) {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< onStkMenuReset not implemented");
    }

    public void resetAttachApnInd(int type) {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< resetAttachApnInd not implemented");
    }

    public void mdChangedApnInd(int type, int apnClassType) {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< mdChangedApnInd not implemented");
    }

    public void pcoDataAfterAttached(int type, PcoDataAttachedInfo pcoData) {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< pcoDataAfterAttached not implemented");
    }

    public void onPcoStatus(int type, ArrayList<Integer> pco) {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< onPcoStatus not implemented");
    }

    public void confSRVCC(int type, ArrayList<Integer> callIds) {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< confSRVCC not implemented");
    }

    public void volteLteConnectionStatus(int type, ArrayList<Integer> state) {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< volteLteConnectionStatus not implemented");
    }

    public void onMdDataRetryCountReset(int type) {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< onMdDataRetryCountReset not implemented");
    }

    public void onRemoveRestrictEutran(int type) {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< onRemoveRestrictEutran not implemented");
    }

    public void onLteAccessStratumStateChanged(int type, ArrayList<Integer> state) {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< onLteAccessStratumStateChanged not implemented");
    }

    public void onTxPowerIndication(int type, ArrayList<Integer> indPower) {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< onTxPowerIndication not implemented");
    }

    public void onPseudoCellInfoInd(int type, ArrayList<Integer> cellInfo) {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< onPseudoCellInfoInd not implemented");
    }

    public void onMccMncChanged(int type, String mccmnc) {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< onMccMncChanged not implemented");
    }

    public void onTxPowerStatusIndication(int type, ArrayList<Integer> indPower) {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< onTxPowerStatusIndication not implemented");
    }

    public void networkRejectCauseInd(int type, ArrayList<Integer> data) {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< networkRejectCauseInd not implemented");
    }

    public void dsbpStateChanged(int indicationType, int dsbpState) {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< dsbpStateChanged not implemented");
    }

    public void smlSlotLockInfoChangedInd(int type, ArrayList<Integer> info) {
        if (RIL.RILJ_LOGD) mRil.riljLog("[MTK]< smlSlotLockInfoChangedInd not implemented");
    }
    //-- MTK Radio V3_0
}
